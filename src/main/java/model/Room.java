package model;

public class Room {
    private Integer id;
    private Integer number;
    private String block;

    public Room() {}

    public Room(Integer id, Integer number, String block) {
        this.id = id;
        this.number = number;
        this.block = block;
    }

    public long getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getNumber() { return number; }
    public void setNumber(Integer number) { this.number = number; }
    public String getBlock() { return block; }
    public void setBlock(String block) { this.block = block; }

}
