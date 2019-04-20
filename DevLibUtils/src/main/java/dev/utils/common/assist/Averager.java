package dev.utils.common.assist;

import java.util.ArrayList;
import java.util.List;

/**
 * detail: 均值计算器 - 用以统计平均数
 * @author Ttt
 */
public class Averager {

    private List<Number> mNumLists = new ArrayList<>();

    /**
     * 添加一个数字
     * @param number number
     */
    public synchronized void add(final Number number) {
        mNumLists.add(number);
    }

    /**
     * 清除全部
     */
    public void clear() {
        mNumLists.clear();
    }

    /**
     * 返回参与均值计算的数字个数
     * @return 返回添加的数字数量
     */
    public Number size() {
        return mNumLists.size();
    }

    /**
     * 获取平均数
     * @return 返回全部数字之和平均数
     */
    public Number getAverage() {
        if (mNumLists.size() == 0) {
            return 0;
        } else {
            Float sum = 0f;
            for (int i = 0, size = mNumLists.size(); i < size; i++) {
                sum = sum.floatValue() + mNumLists.get(i).floatValue();
            }
            return sum / mNumLists.size();
        }
    }

    /**
     * 打印数字集合
     * @return 返回添加的数字信息
     */
    public String print() {
        return "printList(" + size() + "): " + mNumLists;
    }
}
