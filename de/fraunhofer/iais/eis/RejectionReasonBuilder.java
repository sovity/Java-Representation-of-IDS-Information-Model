package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class RejectionReasonBuilder implements Builder<RejectionReason> {

    private RejectionReasonImpl rejectionReasonImpl;

    public RejectionReasonBuilder() {
        rejectionReasonImpl = new RejectionReasonImpl();
    }

    public RejectionReasonBuilder(URI id) {
        this();
        rejectionReasonImpl.id = id;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    @Override
    public RejectionReason build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(rejectionReasonImpl);
        return rejectionReasonImpl;
    }
}
