package blocksProject.implementations;

import blocksProject.interfaces.Block;
import blocksProject.interfaces.CompositeBlock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompositeBlockImplementation extends BlockImplementation implements CompositeBlock {

    private List<Block> blocks;
    private String color;
    private String material;

    public CompositeBlockImplementation(String color, String material, List<Block> blocks) {
        this.color = color;
        this.material = material;
        this.blocks = new ArrayList<>(blocks);
    }

    public CompositeBlockImplementation(String color, String material) {
        super(color, material);
    }


    @Override
    public List<Block> getBlocks() {
        return Collections.unmodifiableList(blocks);
    }

    @Override
    public void addBlock(Block block) {
        blocks.add(block);

    }

    @Override
    public void removeBlock(Block block) {
        blocks.remove(block);

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
