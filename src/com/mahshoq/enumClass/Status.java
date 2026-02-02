package com.mahshoq.enumClass;

public enum Status {
    SUCCESS(200),ERROR(500),NOT_FOUND(404);
    //   public static final Status SUCCESS = new Status("SUCCESS", 0, 200);
    //    public static final Status ERROR = new Status("ERROR", 1, 500);
    //    public static final Status NOT_FOUND = new Status("NOT_FOUND", 2, 404);

    private int code;


    Status(int code) {
        this.code=code;
    }

    public int getCode(){
        return code;
    }
}
