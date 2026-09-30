package com.sitepark.ies.extensions.rest.api;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("PMD.ImplicitFunctionalInterface")
public interface ObjectMapperProvider {
  ObjectMapper get();
}
