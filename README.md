## API endpoint definitions

### Entities

| HTTP verbs | Plural URL | Singular URL |
|------------|---|---|
| `GET`      | `/entities` - retrieves collections of Entities resources. It is possible to use Request-Parameter or filters with a HTTP-Body like `{"filter":{...}}` | `/entities/{id}` retrieves single Entity resource |
| `POST`     | `/entities` - creates or update a single Entity resource. | - |
| `PUT`      | `/entities` - create or update collections of Entity resources. Use HTTP-Body `[{...},{...}]` | `/entities/{id}` - update single Entity resource |
| `PATCH`    | `/entities` - patch collection of Entity resources, see [JSON Patch](https://jsonpatch.com/) | `/entities/{id}` - patch single Entity resource, see [JSON Patch](https://jsonpatch.com/)  |
| `DELETE`   | `/entities` - delete Entity resources. It is possible to use Request-Parameter or filters with a HTTP-Body like `{"filter":{...}}`. Without filter all Entities will be deleted | `/entities/{id}` - delete single Entity resource |

### Relations

| HTTP verbs | Plural URL | Singular URL |
|------------|---|---|
| `GET`      | `/entities/{id}/relations` - retrieves collections of Entities relations. It is possible to use Request-Parameter or filters with a HTTP-Body like `{"filter":{...}}` | `/entities/{id}/relations/{id}` retrieves single Entity relation |
| `POST`     | `/entities/{id}/relations` - add a collection of Entity relations to the relations. Use HTTP-Body `[{relation_id},{relation_id}]` | - |
| `PUT`      | `/entities/{id}/relations` - replace collection of Entity relations | - |
| `PATCH`    | `/entities/{id}/relations` - patch collection of Entity relations, see [JSON Patch](https://jsonpatch.com/) | - |
| `DELETE`   | `/entities/{id}/relations` - delete Entity relations. It is possible to use Request-Parameter or filters with a HTTP-Body like `{"filter":{...}}`. Without filter all Entity relations will be deleted | `/entities/{id}/relations/{relation_id}` - delete single Entity relations |

### States
| HTTP verbs | Plural URL | Singular URL |
|------------|---|---|
| `POST`   | `/entities/activate` - activate Entity resources. It is possible to use Request-Parameter or filters with a HTTP-Body like `{"filter":{...}}` | `/entities/{id}/activate` - activate single Entity resource |
| `POST`   | `/entities/deactivate` - deactivate Entity resources. It is possible to use Request-Parameter or filters with a HTTP-Body like `{"filter":{...}}` | `/entities/{id}/deactivate` - deactivate single Entity resource |

The status to be set can be named arbitrarily. For example also like `/entities/{id}/star` and `/entities/{id}/unstar`.  Enumerations are also possible. Like e.g. `/entities/{id}/speed/slow`, `/entities/{id}/speed/medium`, `/entities/{id}/speed/hight`.



Resources:

- https://eclipse-ee4j.github.io/jersey.github.io/documentation/latest/getting-started.html
- https://stackoverflow.com/questions/25018104/how-to-unit-test-jersey-guice-servicelocator
- https://swagger.io/
- https://blog.apilayer.com/an-ultimate-guide-to-http-put-vs-post-in-rest-api-in-2023/#How_To_Use_Put