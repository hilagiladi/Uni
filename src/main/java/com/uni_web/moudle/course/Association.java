package com.uni_web.moudle.course;

public enum Association {

    מדעי_המחשב,
    מדעים,
    מתמטיקה,
    פיזיקה,
    אסטרונומיה,
    מדעי_החיים;

    public String getDisplayName() {
        return name().replace("_", " ");
    }
}
