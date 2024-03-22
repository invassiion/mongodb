package com.example.mongo.user.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EditUserRequest extends CreateUserRequest{
    private String id;

}
