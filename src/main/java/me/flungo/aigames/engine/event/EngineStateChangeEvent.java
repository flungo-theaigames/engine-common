/*
 * Copyright 2015 Fabrizio Lungo <fab@lungo.co.uk>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.flungo.aigames.engine.event;

import me.flungo.aigames.engine.api.Engine;
import me.flungo.aigames.engine.api.EngineState;
import me.flungo.aigames.engine.api.event.AbstractEvent;

/**
 *
 * @author Fabrizio Lungo <fab@lungo.co.uk>
 */
public class EngineStateChangeEvent extends AbstractEvent
        implements me.flungo.aigames.engine.api.event.EngineStateChangeEvent {

    private final EngineState previousState;
    private final EngineState newState;

    public EngineStateChangeEvent(EngineState previousState, EngineState newState, Engine engine) {
        super(engine);
        this.previousState = previousState;
        this.newState = newState;
    }

    @Override
    public EngineState getPreviousState() {
        return previousState;
    }

    @Override
    public EngineState getNewState() {
        return newState;
    }

}
