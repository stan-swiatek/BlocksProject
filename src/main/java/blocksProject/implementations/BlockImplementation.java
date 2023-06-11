package blocksProject.implementations;

import blocksProject.interfaces.Block;

public class BlockImplementation implements Block {
    private String color;
    private String material;

    public BlockImplementation(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public BlockImplementation() {
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }
}
