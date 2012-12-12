/*
 * Copyright (c) 2008 - 2012 10gen, Inc. <http://10gen.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.mongodb;

import org.mongodb.MongoDocument;
import org.mongodb.MongoFieldSelectorDocument;
import org.mongodb.MongoQueryFilterDocument;
import org.mongodb.operation.MongoFieldSelector;

// TODO: Implement these methods
public class DBObjects {
    private DBObjects() {
    }

    public static MongoDocument toDocument(DBObject obj) {
        return new MongoDocument();
    }

    public static MongoQueryFilterDocument toQueryFilterDocument(DBObject obj) {
        return new MongoQueryFilterDocument();
    }

    public static DBObject toDBObject(MongoDocument document) {
        return new BasicDBObject();
    }

    public static MongoFieldSelector toFieldSelectorDocument(final DBObject fields) {
        return new MongoFieldSelectorDocument();
    }
}
