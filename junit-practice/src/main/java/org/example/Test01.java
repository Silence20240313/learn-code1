package org.example;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class Test01 {
    @Test
    public void testMax(){
        Max max = new Max();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(98);
        list.add(36);
        list.add(53);
        list.add(22);
        int result = max.max(list);

        // 测试：Assert.assertEquals("错误信息",期待值,方法运行后的结果);
        Assert.assertEquals("方法内部有bug",78,result);

    }
}
