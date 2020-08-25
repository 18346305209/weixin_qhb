package day12.hongbao;

import day12.hongbao.utils.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/totalCount;
        int mod = totalMoney%totalCount;
        for (int i = 0; i <totalCount-1 ; i++) {
            list.add(avg);
        }
        //零头放最后
        list.add(avg+mod);

        return list;
    }
}
