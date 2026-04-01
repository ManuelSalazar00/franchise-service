package co.com.bancolombia.s3.adapter;

import org.springframework.stereotype.Repository;
import co.com.bancolombia.s3.config.model.S3ConnectionProperties;
import co.com.bancolombia.s3.operations.S3Operations;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class S3Adapter /* implements Gateway from domain*/ {

    private final S3Operations s3Operations;

    private final S3ConnectionProperties properties;

}
