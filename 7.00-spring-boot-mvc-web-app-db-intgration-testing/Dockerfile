# =========================
# Stage 1: Build ứng dụng
# =========================
FROM maven:3.9.9-eclipse-temurin-21 AS builder

# Đặt thư mục làm việc
WORKDIR /app

# Copy file pom.xml và tải dependencies trước (tối ưu cache)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy toàn bộ source code và build
COPY src ./src
RUN mvn clean package -DskipTests

# =========================
# Stage 2: Run ứng dụng
# =========================
FROM eclipse-temurin:21-jdk

# Đặt thư mục làm việc
WORKDIR /app

# Copy file jar từ stage build sang
COPY --from=builder /app/target/*.jar app.jar

# Expose port Spring Boot (mặc định 8080)
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
