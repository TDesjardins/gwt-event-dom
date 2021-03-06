/*
 * Copyright © 2019 The GWT Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.event.dom.client;
/*
 * Copyright 2018 The GWT Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import org.gwtproject.dom.client.BrowserEvents;

/**
 * Represents a native media progress event.
 *
 * <p><span style="color:red">Experimental API: This API is still under development and is subject
 * to change. </span>
 */
public class ProgressEvent extends DomEvent<ProgressHandler> {

  /** Event type for media progress events. Represents the meta-data associated with this event. */
  private static final Type<ProgressHandler> TYPE =
      new Type<>(BrowserEvents.PROGRESS, new ProgressEvent());

  /**
   * Protected constructor, use {@link
   * DomEvent#fireNativeEvent(org.gwtproject.dom.client.NativeEvent,
   * org.gwtproject.event.shared.HasHandlers)} to fire media progress events.
   */
  protected ProgressEvent() {}

  /**
   * Gets the event type associated with media progress events.
   *
   * @return the handler type
   */
  public static Type<ProgressHandler> getType() {
    return TYPE;
  }

  @Override
  public final Type<ProgressHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ProgressHandler handler) {
    handler.onProgress(this);
  }
}
