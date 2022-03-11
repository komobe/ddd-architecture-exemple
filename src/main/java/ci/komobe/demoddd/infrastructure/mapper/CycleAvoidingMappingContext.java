/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package ci.komobe.demoddd.infrastructure.mapper;

import java.util.IdentityHashMap;
import java.util.Map;
import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;

/**
 * @author Moro KONÉ 2022-03-11
 * @see <a href="https://github.com/mapstruct/mapstruct-examples/blob/master/mapstruct-mapping-with-cycles/src/main/java/org/mapstruct/example/mapper/CycleAvoidingMappingContext.java">Inspiration</a>
 */
public class CycleAvoidingMappingContext {

  private final Map<Object, Object> knownInstances = new IdentityHashMap<>();

  @BeforeMapping
  public <T> T getMappedInstance(Object source, @TargetType Class<T> targetType) {
    return targetType.cast(knownInstances.get(source));
  }

  @BeforeMapping
  public void storeMappedInstance(Object source, @MappingTarget Object target) {
    knownInstances.put(source, target);
  }
}