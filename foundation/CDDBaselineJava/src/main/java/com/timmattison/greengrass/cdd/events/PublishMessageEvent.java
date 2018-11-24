package com.timmattison.greengrass.cdd.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PublishMessageEvent {
    private String topic;
    private String message;
}
