/**
 * Copyright (C) 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.cdi.client.remote;

import org.jboss.errai.bus.server.annotations.Remote;
import org.jboss.errai.cdi.client.payload.GenericPayload;
import org.jboss.errai.cdi.client.payload.ParameterizedSubtypePayload;

/**
 *
 * @author Max Barkley <mbarkley@redhat.com>
 */
@Remote
public interface GenericService {

  <A, B> GenericPayload<A, B> genericRoundTrip(GenericPayload<A, B> payload);

  GenericPayload<String, Integer> parameterizedRoundTrip(GenericPayload<String, Integer> payload);

  ParameterizedSubtypePayload parameterizedSubtypeRoundTrip(ParameterizedSubtypePayload payload);

}
