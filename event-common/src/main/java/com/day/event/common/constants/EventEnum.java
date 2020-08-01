package com.day.event.common.constants;

import lombok.Getter;

/**
 * @author Day
 * @date 2020/8/1 19:24
 */
@Getter
public enum EventEnum {


    /**
     * 正常流程
     */
    NORMAL,

    /**
     * 异常流程
     */
    EXCEPTION,

    /**
     * 均触发
     */
    ALL;

    EventEnum() {
    }

    public static boolean isException(EventEnum eventEnum) {
        return EventEnum.EXCEPTION.equals(eventEnum) || EventEnum.ALL.equals(eventEnum);
    }

    public static boolean isNormal(EventEnum eventEnum) {
        return EventEnum.NORMAL.equals(eventEnum) || EventEnum.ALL.equals(eventEnum);
    }


}
