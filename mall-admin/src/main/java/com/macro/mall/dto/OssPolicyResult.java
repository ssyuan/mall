package com.macro.mall.dto;

import lombok.Data;

/**
 * 获取OSS上传授权返回结果
 * Created by macro on 2018/5/17.
 */
@Data
public class OssPolicyResult {
    private String accessKeyId;
    private String policy;
    private String signature;
    private String dir;
    private String host;
}
