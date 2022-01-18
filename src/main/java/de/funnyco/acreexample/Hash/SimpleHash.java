package de.funnyco.acreexample.Hash;

import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@Data
@RedisHash("Hash")
public class SimpleHash {
    private final String id;
    private final String name;
    private final String text;
}