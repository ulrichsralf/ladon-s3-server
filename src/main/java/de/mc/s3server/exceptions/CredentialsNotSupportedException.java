/*
 * Copyright (c) 2016 Mind Consulting UG(haftungsbeschränkt)
 */

package de.mc.s3server.exceptions;

import de.mc.s3server.entities.api.S3RequestId;

/**
 * Created by Ralf Ulrich on 20.02.16.
 */
public class CredentialsNotSupportedException extends S3ServerException {
    public CredentialsNotSupportedException(String resource, S3RequestId requestId) {
        super("This request does not support credentials", resource, requestId);
    }


}
