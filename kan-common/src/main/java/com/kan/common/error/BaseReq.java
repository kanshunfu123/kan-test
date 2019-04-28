package com.kan.common.error;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jim
 * @date 16/10/12
 */
public class BaseReq implements Serializable {





    /**
     * 检查参数是否合法
     *
     * @return
     */
    public void checkData() {
        Map<String, Object> checkParam = new HashMap<>();
        ParamsUtil.hasEmptyParamMap(checkParam);
    }

    public void trimData() {

    }

    public interface Add {

    }
    public interface select {

    }

    public interface Modify {

    }

    public interface Delete {

    }

    public interface Query {

    }

    public interface Status {

    }

    public interface Detail {

    }

    public interface Submit {

    }
    public interface Permission {

    }
}
