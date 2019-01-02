package cn.enilu.guns.bean.entity.system;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name="t_sys_task")
@Entity
@Data
public class Task{
    @Id
    @GeneratedValue
    private Long id;
    @Column(columnDefinition = "VARCHAR(50) COMMENT '任务名'")
    private String name;

    @Column(name="job_group", columnDefinition = "VARCHAR(50) COMMENT '任务组名'")
    private String jobGroup;

    @Column(name="job_class", columnDefinition = "VARCHAR(255) COMMENT '执行类'")
    private String jobClass;

    @Column(name="note", columnDefinition = "VARCHAR(255) COMMENT '任务说明'")
    private String note;

    @Column(name="cron", columnDefinition = "VARCHAR(50) COMMENT '定时规则'")
    private String cron;

    @Column(name="concurrent", columnDefinition = "TINYINT COMMENT '是否允许并发'")
    private boolean concurrent;

    @Column(name="data", columnDefinition = "TEXT COMMENT '执行参数'")
    private String data;

    @Column(name="exec_at", columnDefinition = "DateTime COMMENT '执行时间'")
    private Date execAt;

    @Column(name="exec_result", columnDefinition = "text COMMENT '执行结果'")
    private String execResult;

    @Column(name="disabled", columnDefinition = "TINYINT COMMENT '是否禁用'")
    private boolean disabled;
    @Column
    private Date createtime;
    @Column
    private Long creator;
}
