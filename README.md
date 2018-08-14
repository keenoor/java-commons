java-commons
---
one commonly used utils lib for java, its come from every good idea.

## upload to bintray cmd
``
./gradlew clean build -x test bintrayUpload -PbintrayUser=truthpure -PbintrayKey=xxx -PdryRun=false
``

## utils
- GsonUtil
- JscksonUtil
- FastjsonUtil
- ...

## commons
- ...

## tips
1. version cannot conflict every time when you upload
2. 