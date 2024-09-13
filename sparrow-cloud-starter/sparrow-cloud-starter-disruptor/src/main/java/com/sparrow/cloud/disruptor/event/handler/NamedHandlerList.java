/**
 *    Copyright 2023 sdeven.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.sparrow.cloud.disruptor.event.handler;


import com.sparrow.cloud.disruptor.event.handler.chain.HandlerChain;
import com.sparrow.cloud.disruptor.context.event.DisruptorEvent;

import java.util.List;


public interface NamedHandlerList<T extends DisruptorEvent> extends List<DisruptorHandler<T>> {
	 
	/**
     * Returns the configuration-unique name assigned to this {@code Handler} list.
     * @return configuration-unique name
     */
    String getName();

    /**
     * Returns a new {@code HandlerChain<T>} instance that will first execute this list's {@code Handler}s (in list order)
     * and end with the execution of the given {@code handlerChain} instance.
     * @param handlerChain {@code HandlerChain<T>} instance 
     * @return  {@code HandlerChain<T>} instance 
     */
    HandlerChain<T> proxy(HandlerChain<T> handlerChain);
    
}
