#  Deploy Java war
FROM adoptopenjdk/openjdk11:jre-11.0.4_11-alpine
WORKDIR /app/mtsj-booking
COPY --from=build /app/mtsj-booking/server/target/mtsjbooking-bootified.war /app/mtsj-booking/
#HEALTHCHECK --interval=10s --timeout=5s --start-period=30s --retries=3 CMD curl --fail http://booking:9080/mythaistar/services/rest/dishmanagement/v1/category/0/ || exit 1 
ENTRYPOINT ["java","-jar","/app/mtsj-booking/mtsjbooking-bootified.war"]
EXPOSE 9080
