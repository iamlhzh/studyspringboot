package com.lhzh.amqp.bean;

public class MqMsg {

    private String exchangeName;

    private String routingKey;

    private Dog dog;

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "MqMsg{" +
                "exchangeName='" + exchangeName + '\'' +
                ", routingKey='" + routingKey + '\'' +
                ", dog=" + dog +
                '}';
    }
}
