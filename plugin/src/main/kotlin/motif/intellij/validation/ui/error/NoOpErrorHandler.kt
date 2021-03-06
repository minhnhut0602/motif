/*
 * Copyright (c) 2018 Uber Technologies, Inc.
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
package motif.intellij.validation.ui.error

import motif.intellij.validation.ui.GraphError
import motif.models.errors.MotifError
import motif.models.graph.Graph

class NoOpErrorHandler : ErrorHandler<MotifError> {

    override fun handle(graph: Graph, error: MotifError) : List<GraphError> {
        return listOf(GraphError(null, error::class.java.name))
    }

    companion object {

        fun create() : ErrorHandler<MotifError> {
            return NoOpErrorHandler()
        }
    }
}