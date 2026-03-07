package io.vladimirdev.iam_service.model.response;

import ch.qos.logback.core.util.StringUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
@Data@AllArgsConstructor
public class IamResponse <P extends Serializable> implements Serializable {
    private String message;
    private P payload;
    private boolean success;

    public static <P extends  Serializable>IamResponse<P> createSuccessful(P payload){
        return new IamResponse<>(StringUtils.EMPTY,payload,true);
    }
}
