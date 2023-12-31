package com.mfp.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(400, "参数校验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限"),
    // 添加 ITEM_DELETE_FAILED 枚举值
    ITEM_DELETE_FAILED(50001, "删除商品失败");

    private final Integer code;
    private final String message;
}