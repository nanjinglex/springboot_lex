//package com.example.springboottest.elasticjob;
//
//
//import org.apache.shardingsphere.elasticjob.lite.internal.schedule.JobScheduler;
//import org.apache.shardingsphere.elasticjob.reg.zookeeper.ZookeeperRegistryCenter;
//import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class MyJobConfig {
//
//    private final String cron = "0/5 * * * * ?";
//    private final int shardingTotalCount = 3;
//    private final String shardingItemParameters = "0=A,1=B,2=C";
//    private final String jobParameters = "parameter";
//
//    @Autowired
//    private ZookeeperRegistryCenter regCenter;
//
//    @Autowired
//    private DataSource dataSource; //数据源已经存在，直接引入
//
//    @Bean
//    public SimpleJob stockJob() {
//        return new MySimpleJob();
//    }
//
//    @Bean(initMethod = "init")
//    public JobScheduler simpleJobScheduler(final SimpleJob simpleJob) {
//        // 增加任务事件追踪配置
//        JobEventConfiguration jobEventConfig = new JobEventRdbConfiguration(dataSource);
//        //创建SpringJobScheduler
//        return new SpringJobScheduler(simpleJob, regCenter, getLiteJobConfiguration(simpleJob.getClass(),
//                cron, shardingTotalCount, shardingItemParameters, jobParameters),jobEventConfig);
//    }
//
//    private LiteJobConfiguration getLiteJobConfiguration(final Class<? extends SimpleJob> jobClass,
//                                                         final String cron,
//                                                         final int shardingTotalCount,
//                                                         final String shardingItemParameters,
//                                                         final String jobParameters) {
//        // 定义作业核心配置
//        JobCoreConfiguration simpleCoreConfig = JobCoreConfiguration.newBuilder(jobClass.getName(), cron, shardingTotalCount).
//                shardingItemParameters(shardingItemParameters).jobParameter(jobParameters).build();
//        // 定义SIMPLE类型配置
//        SimpleJobConfiguration simpleJobConfig = new SimpleJobConfiguration(simpleCoreConfig, jobClass.getCanonicalName());
//        // 定义Lite作业根配置
//        LiteJobConfiguration simpleJobRootConfig = LiteJobConfiguration.newBuilder(simpleJobConfig).overwrite(true).build();
//        return simpleJobRootConfig;
//
//    }
//}
//
