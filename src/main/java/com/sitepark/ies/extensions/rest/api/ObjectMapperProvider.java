package com.sitepark.ies.extensions.rest.api;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The object mapper the REST API reads and writes JSON with (Jackson 2), e.g. to apply a JSON patch
 * in the same way.
 */
@SuppressWarnings("PMD.ImplicitFunctionalInterface")
public interface ObjectMapperProvider {
  ObjectMapper get();
}
