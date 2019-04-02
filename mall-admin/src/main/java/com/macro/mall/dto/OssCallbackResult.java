package com.macro.mall.dto;

import lombok.Data;

/**
 * Created by macro on 2018/5/17.
 */
@Data
public class OssCallbackResult {
    private String filename;
    private String size;
    private String mimeType;
    private String width;
    private String height;
}
