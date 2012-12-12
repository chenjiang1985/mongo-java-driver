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

import java.util.Map;
import java.util.Set;

public interface DBObject {
    /**
     * Sets a name/value pair in this object.
     * @param key Name to set
     * @param v Corresponding value
     * @return <tt>v</tt>
     */
    public Object put( String key , Object v );

    /**
     * Sets all key/value pairs from an object into this object
     * @param o the object
     */
//    public void putAll( BSONObject o );

    /**
     * Sets all key/value pairs from a map into this object
     * @param m the map
     */
    public void putAll( Map m );

    /**
     * Gets a field from this object by a given name.
     * @param key The name of the field fetch
     * @return The field, if found
     */
    public Object get( String key );

    /**
     * Returns a map representing this BSONObject.
     * @return the map
     */
    public Map toMap();

    /**
     * Removes a field with a given name from this object.
     * @param key The name of the field to remove
     * @return The value removed from this object
     */
    public Object removeField( String key );

    /**
     * Deprecated
     * @param s
     * @return True if the key is present
     * @deprecated
     */
    @Deprecated
    public boolean containsKey( String s );

    /**
     * Checks if this object contains a field with the given name.
     * @param s Field name for which to check
     * @return True if the field is present
     */
    public boolean containsField(String s);

    /**
     * Returns this object's fields' names
     * @return The names of the fields in this object
     */
    public Set<String> keySet();

    /**
     * if this object was retrieved with only some fields (using a field filter)
     * this method will be called to mark it as such.
     */
    public void markAsPartialObject();

    /**
     * whether markAsPartialObject was ever called
     * only matters if you are going to upsert and do not want to risk losing fields
     */
    public boolean isPartialObject();
}
