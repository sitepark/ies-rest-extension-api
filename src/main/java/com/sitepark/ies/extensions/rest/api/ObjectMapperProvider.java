package com.sitepark.ies.extensions.rest.api;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface ObjectMapperProvider {
  ObjectMapper get();
}
