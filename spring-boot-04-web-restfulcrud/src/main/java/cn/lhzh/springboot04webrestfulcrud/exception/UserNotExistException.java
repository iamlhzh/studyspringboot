package cn.lhzh.springboot04webrestfulcrud.exception;

public class UserNotExistException extends RuntimeException{
    public UserNotExistException() {
        super("用户不存在");
    }
}
