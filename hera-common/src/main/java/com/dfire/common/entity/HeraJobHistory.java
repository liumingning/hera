package com.dfire.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 17:31 2018/1/11
 * @desc
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HeraJobHistory {

    private String id;

    private String jobId;

    private Date startTime;

    private Date endTime;

    private String executeHost;

    private String operator;

    private String status;

    private Integer triggerType;

    private String illustrate;

    private String statisticsEndTime;

    private String log ;

    private String timezone;

    private String cycle;

    private String hostGroupId;

    String properties ;
}