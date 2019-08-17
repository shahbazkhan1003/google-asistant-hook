package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GooglePayload {

    private boolean expectUserResponse;
    private RichResponse richResponse;


}
