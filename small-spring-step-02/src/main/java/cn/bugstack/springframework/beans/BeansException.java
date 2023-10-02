package cn.bugstack.springframework.beans;

public class BeansException extends Throwable {

    private String msg;

    private Exception e;

    public BeansException(String msg, Exception e) {
        super(msg,e);
    }

    public BeansException(String msg) {
        super(msg);
    }
}
