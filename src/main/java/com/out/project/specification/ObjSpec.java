package com.out.project.specification;

import com.out.project.common.exception.LogicException;

/**
 * FileName: ObjSpec
 * Description: 规则校验
 *
 * @author 林刚
 * date: 2020/12/11
 */
public class ObjSpec {

    /**
     * 对象校验
     *
     * @param obj
     */
    public static void assertHanding(Object obj) {
        if (obj == null) {
            throw new LogicException("对象不存在");
        }

    }

}
