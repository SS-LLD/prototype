package com.singla.lld.prototype.model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
public class Room implements Cloneable{
    String id;
    String type;
    String number;
    int beds;


    @Override
    public Room clone() {
        return Room.builder()
                .id(this.id)
                .type(this.type)
                .number(this.number)
                .beds(this.beds).build();
    }
}
