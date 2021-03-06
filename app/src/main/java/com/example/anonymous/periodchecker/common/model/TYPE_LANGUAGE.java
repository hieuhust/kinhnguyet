package com.example.anonymous.periodchecker.common.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Huy Hieu on 12/23/2016.
 */

public enum TYPE_LANGUAGE {
    VIET_NAM(0),
    ENGLAND(1);

    private transient int value;

    TYPE_LANGUAGE(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public static TYPE_LANGUAGE convertIntToTypeLanguage(int value) {
        if (value == VIET_NAM.getValue()) {
            return VIET_NAM;
        } else {
            return ENGLAND;
        }
    }
}
