//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.common.web;

import org.apache.commons.lang3.StringUtils;

import java.beans.PropertyEditorSupport;

public class CustomStringEditor extends PropertyEditorSupport {
    public CustomStringEditor() {
    }

    public void setAsText(String text) throws IllegalArgumentException {
        if(StringUtils.isBlank(text)) {
            this.setValue((Object)null);
        } else {
            this.setValue(text);
        }
    }
}
