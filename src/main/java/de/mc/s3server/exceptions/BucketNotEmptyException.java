/*
 * Copyright (c) 2016 Mind Consulting UG(haftungsbeschränkt)
 */

package de.mc.s3server.exceptions;

import de.mc.s3server.entities.api.S3RequestId;

/**
 * Created by Ralf Ulrich on 20.02.16.
 */
public class BucketNotEmptyException extends S3ServerException {

    public BucketNotEmptyException(String resource, S3RequestId requestId) {
        super("The bucket you tried to delete is not empty.", resource, requestId);
    }

}
