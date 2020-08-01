package com.day.event.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Day
 * @date 2020/8/1 19:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDTO {

    private String eventCode;

    private String message;

}
