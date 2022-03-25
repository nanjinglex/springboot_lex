package com.example.springboottest.util.rdbms;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName JdbcGetMetadataUtil.java
 * @Description
 * @createTime 2022年03月10日 19:43:00
 */
@Slf4j
public class JdbcGetMetadataUtil {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

//        Connection connection = ConnectionUtil.getConnection("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
//        query(connection,"select * from test;");
//        connection.close();
//
//        Connection connectionMysql = ConnectionUtil.getConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/tungee_bigdata", "root", "123456");

        Properties info = new Properties();
        String user = "root";
        String password = "123456";
        if (user != null) {
            info.put("user", user);
        }
        if (password != null) {
            info.put("password", password);
        }
        info.put("useInformationSchema", true);

        Connection connectionMysql = ConnectionUtil.getConnection("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/tungee_bigdata?useSSL=false", info);
//        queryAllTables(connectionMysql);
//        connectionMysql.close();


        querymysqlmetadata(connectionMysql);
//        getMeta(connectionMysql);


        Connection connectionpost = ConnectionUtil.getConnection("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/mypostdatabase", "lex", "lex");

        System.out.println("============================================================================================================================");
//        querypostmetadata(connectionpost);

    }


    public static void getMeta(Connection conn) throws SQLException{

        String sql = "select TABLE_NAME,CREATE_TIME,UPDATE_TIME from information_schema.TABLES where TABLE_SCHEMA = 'tungee_bigdata' ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            log.info("表名:{},CTRATE_TIME:{},UPDATE_TIME:{},",
                    rs.getString("TABLE_NAME"),rs.getTimestamp("CREATE_TIME"),rs.getTimestamp("UPDATE_TIME"));
        }

        // 获取表的元数据（通过ResultSetMetaData我们可以拿到该表的表结构,每个字段的类型，是否可为空值等）
//        DatabaseMetaData metaData = conn.getMetaData();
//        ResultSetMetaData rsm = ps.getMetaData();
//        for (int i = 1; i < rsm.getColumnCount(); i++) {
//            System.out.println("\t列名" + rsm.getColumnLabel(i) + "\t列类型：" + rsm.getColumnTypeName(i) + "\t是否可为null："
//                    + rsm.isNullable(i));
//        }
//        System.out.println("======================================");
//        // 获取执行结果元数据（可以在不知道列名的情况下，盲取该表的所有数据）
//        while (rs.next()) {
//            for (int i = 1; i < rsm.getColumnCount(); i++) {
//                System.out.println("列名：" + rsm.getColumnLabel(i) + "\t列值：" + rs.getObject(i));
//            }
//        }
    }

    public static void querymysqlmetadata(Connection conn) throws SQLException {
        ResultSet schemas = null;
        ResultSet tables = null;
        ResultSet columns = null;
        String schemaName = null;
        String tableName = null;
        String colName = null;
        String remarks = null;
        int dataType;
        String typeName = null;

// 3. 获取数据库元数据，并打印
        DatabaseMetaData metaData = conn.getMetaData();        // 获取DatabaseMetaData对象
        System.out.println(metaData.getDatabaseProductName());    // 打印数据库产品的名称
        System.out.println(metaData.getDatabaseProductVersion());    // 打印数据库版本号
        System.out.println(metaData.getURL());            // 打印数据库的URL
        System.out.println(metaData.getUserName());        // 打印数据库的用户名
        System.out.println("conn.getCatalog():" + conn.getCatalog());
        System.out.println("conn.getSchema:" + conn.getSchema());

        //通常只需要获取此数据库的元数据信息
        String catalog = conn.getCatalog();

        //以下演示获取所有数据库元数据
        //1.向上获取所有数据库 (向上能获取所有数据库)
        ResultSet catalogResult = metaData.getCatalogs();
        ArrayList<String> catalogs = new ArrayList<>();
        while (catalogResult.next()) {
            String db = catalogResult.getString("TABLE_CAT");
            catalogs.add(db);
            System.out.println("数据库catalog：" + db);

            ResultSet schemasResult = metaData.getSchemas(db,null);//mysql 无schema
            while (schemasResult.next()){
                System.out.println("数据库schema：" + catalogResult.getString("TABLE_CAT"));

            }
        }


//        //2.遍历数据库
//        for (String catalog : catalogs) {
//            System.out.println("database:"+catalog);
        //3.能获取所有表名
        tables = metaData.getTables(catalog, null, null, new String[]{"TABLE"});
        while (tables.next()) {
            tableName = tables.getString("TABLE_NAME");
            log.info("  --tableName:{}" , tableName);
            log.info("  --table REMARKS:{}" , tables.getString("REMARKS"));



            ResultSet primaryKeysResultSet = metaData.getPrimaryKeys(catalog, null, tableName);
//                COLUMN_NAME String => 列名称
//                KEY_SEQ short => 主键中的序列号（值 1 表示主键中的第一列，值 2 表示主键中的第二列）。
//                PK_NAME String => 主键的名称（可为 null）
            while (primaryKeysResultSet.next()) {
                System.out.println("    --primaryKeys COLUMN_NAME:" + primaryKeysResultSet.getString("COLUMN_NAME"));
                System.out.println("    --primaryKeys KEY_SEQ:" + primaryKeysResultSet.getShort("KEY_SEQ"));
                System.out.println("    --primaryKeys PK_NAME:" + primaryKeysResultSet.getString("PK_NAME"));
            }



            columns = metaData.getColumns(catalog, null, tableName, "%");
            while (columns.next()) {
                colName = columns.getString("COLUMN_NAME");
//                    columnNames.add(colName);
                remarks = columns.getString("REMARKS");

                dataType = columns.getInt("DATA_TYPE");
                typeName = columns.getString("TYPE_NAME");
                int nullable = columns.getInt("NULLABLE");
                int decimal_digits = columns.getInt("DECIMAL_DIGITS");
                int column_size = columns.getInt("COLUMN_SIZE");
                log.info("    --colName:{},remarks:{},DATA_TYPE:{},typeName:{},nullable:{},decimal_digits:{},column_size:{}", colName, remarks, dataType, typeName, nullable,decimal_digits,column_size);
            }
        }
//        }

// 4. 关闭与数据库的连接
        conn.close();

    }

    public static void querypostmetadata(Connection conn) throws SQLException {
        ResultSet schemas = null;
        ResultSet tables = null;
        ResultSet columns = null;
        String schemaName = null;
        String tableName = null;
        String colName = null;
        String remarks = null;
        int dataType;
        String typeName = null;

// 3. 获取数据库元数据，并打印
        DatabaseMetaData metaData = conn.getMetaData();        // 获取DatabaseMetaData对象
        System.out.println(metaData.getDatabaseProductName());    // 打印数据库产品的名称
        System.out.println(metaData.getDatabaseProductVersion());    // 打印数据库版本号
        System.out.println(metaData.getURL());            // 打印数据库的URL
        System.out.println(metaData.getUserName());        // 打印数据库的用户名
        System.out.println("conn.getCatalog():" + conn.getCatalog());
        System.out.println("conn.getSchema:" + conn.getSchema());

        ResultSet catalogs = metaData.getCatalogs();
        while (catalogs.next()) {
            System.out.println("数据库catalog：" + catalogs.getString("TABLE_CAT"));
        }

        String catalog = conn.getCatalog();
        catalog = "runoobdb";

        schemas = metaData.getSchemas();
        while (schemas.next()) {
            schemaName = schemas.getString("TABLE_SCHEM");
            System.out.println("schemaName:" + schemaName);

            tables = metaData.getTables(catalog, schemaName, null, new String[]{"TABLE"});// null作用同"%",查询所有
            while (tables.next()) {
                tableName = tables.getString("TABLE_NAME");
                System.out.println("  --tableName:" + tableName);
                ResultSet primaryKeysResultSet = metaData.getPrimaryKeys(catalog, schemaName, tableName);
//                COLUMN_NAME String => 列名称
//                KEY_SEQ short => 主键中的序列号（值 1 表示主键中的第一列，值 2 表示主键中的第二列）。
//                PK_NAME String => 主键的名称（可为 null）
                List<JdbcPrimaryKey> primaryKeys = new ArrayList<>();
                while (primaryKeysResultSet.next()) {
                    primaryKeys.add(JdbcPrimaryKey.builder()
                            .columnName(primaryKeysResultSet.getString("COLUMN_NAME"))
                            .keySeq(primaryKeysResultSet.getShort("KEY_SEQ"))
                            .pkName(primaryKeysResultSet.getString("PK_NAME"))
                            .build());
                    System.out.println("    --primaryKeys COLUMN_NAME:" + primaryKeysResultSet.getString("COLUMN_NAME"));
                    System.out.println("    --primaryKeys KEY_SEQ:" + primaryKeysResultSet.getShort("KEY_SEQ"));
                    System.out.println("    --primaryKeys PK_NAME:" + primaryKeysResultSet.getString("PK_NAME"));
                }

                //list转换为json字符串
                String extend = JSON.toJSONString(primaryKeys, SerializerFeature.SortField);
                //json字符串转化为list对象
                List<JdbcPrimaryKey> keys = (List<JdbcPrimaryKey>) JSONArray.parseArray(extend, JdbcPrimaryKey.class);
                List<String> pkColumnList = keys.stream().map(o -> o.getColumnName()).collect(Collectors.toList());
                pkColumnList.stream().forEach(o-> System.out.println("key_clum:"+o));

                columns = metaData.getColumns(catalog, schemaName, tableName, "%");// null作用同"%",查询所有
                while (columns.next()) {
                    colName = columns.getString("COLUMN_NAME");
//                    columnNames.add(colName);
                    remarks = columns.getString("REMARKS");

                    dataType = columns.getInt("DATA_TYPE");
                    typeName = columns.getString("TYPE_NAME");
                    int nullable = columns.getInt("NULLABLE");
                    int decimal_digits = columns.getInt("DECIMAL_DIGITS");

                    int column_size = columns.getInt("COLUMN_SIZE");
                    log.info("    --colName:{},remarks:{},DATA_TYPE:{},typeName:{},nullable:{},decimal_digits:{},column_size:{}", colName, remarks, dataType, typeName, nullable,decimal_digits,column_size);

//                    System.out.println("    --colName:" + colName + ",remarks:" + remarks + ",DATA_TYPE:" + dataType + ",typeName:" + typeName + ",nullable:" + nullable);

                }

            }
        }


// 4. 关闭与数据库的连接
        conn.close();
    }

    public static ResultSet query(Connection conn, String sql) {
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        try {
            System.out.println("Catalog:" + conn.getCatalog());
            System.out.println("Schema:" + conn.getSchema());
            pStatement = conn.prepareStatement(sql);//准备PreparedStatement
            rs = pStatement.executeQuery();//执行查询
            while (rs.next()) {                       //当该结果集的下一条数据不为空，读取下一条数据
                int id = rs.getInt("id");       //读取当前行名为id的列的数据
                String name = rs.getString("name");
//                String gender = rs.getString("gender");
                System.out.println("id:" + id + " 姓名：" + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }

    public static ResultSet queryAllTables(Connection conn) {
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        try {
            String dbName = conn.getCatalog();
            System.out.println("Catalog:" + conn.getCatalog());
            System.out.println("Schema:" + conn.getSchema());
            String allTableSql = "SELECT TABLE_NAME, TABLE_COMMENT FROM information_schema.tables WHERE TABLE_SCHEMA='" + dbName + "';";
            pStatement = conn.prepareStatement(allTableSql);//准备PreparedStatement
            rs = pStatement.executeQuery();//执行查询
            while (rs.next()) {                       //当该结果集的下一条数据不为空，读取下一条数据
                String TABLE_NAME = rs.getString("TABLE_NAME");       //读取当前行名为id的列的数据
                String TABLE_COMMENT = rs.getString("TABLE_COMMENT");
                System.out.println("TABLE_NAME:" + TABLE_NAME + " TABLE_COMMENT：" + TABLE_COMMENT);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }


}
