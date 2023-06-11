import blocksProject.implementations.BlockImplementation;
import blocksProject.implementations.Wall;
import blocksProject.interfaces.Block;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WallTests {

    private Wall wall;



    @BeforeEach
    public void setup() {
        List<Block> blocks = new ArrayList<>();
        blocks.add(new BlockImplementation("Red", "Brick"));
        blocks.add(new BlockImplementation("Blue", "Concrete"));
        blocks.add(new BlockImplementation("Green", "Wood"));

        wall = new Wall(blocks);

    }



    @Test
    public void testFindBlockByColor() {
        Optional<Block> block = wall.findBlockByColor("Blue");
        Assertions.assertTrue(block.isPresent());
        Assertions.assertEquals("Blue", block.get().getColor());
    }

    @Test
    public void testFindBlocksByMaterial() {
        List<Block> blocks = wall.findBlocksByMaterial("Wood");
        Assertions.assertEquals(1, blocks.size());
        Assertions.assertEquals("Green", blocks.get(0).getColor());
    }

    @Test
    public void testCount() {
        int count = wall.count();
        Assertions.assertEquals(3, count);
    }







}
