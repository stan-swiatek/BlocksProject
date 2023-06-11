package blocksProject.implementations;

import blocksProject.interfaces.Block;
import blocksProject.interfaces.Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {

    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = new ArrayList<>(blocks);
    }


    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(block -> block.getColor().equalsIgnoreCase(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> block.getMaterial().equals(material))
                .toList();
    }


    @Override
    public int count() {
        return blocks.size();
    }
}
