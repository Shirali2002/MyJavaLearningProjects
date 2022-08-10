package complicatedLists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.assertj.core.groups.Tuple;
import org.junit.Test;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class ComplexTestList {

    @Test
    public void testList(){
        List<Item> list = new ArrayList<>();
        list.add(new Item(1, "jack"));
        list.add(new Item(2, "sam"));
        list.add(new Item(3, "jack"));

        Assertions.assertThat(list)
                .extracting("name")
                .contains("jack");

        Assertions.assertThat(list)
                .extracting("id", "name")
                .contains(
                        Tuple.tuple(1, "jack"),
                        Tuple.tuple(2, "sam")
                );
    }



    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Item {
        private int id;
        private String name;
    }

}
