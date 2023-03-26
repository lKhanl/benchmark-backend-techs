# Build stage
FROM mcr.microsoft.com/dotnet/sdk:3.1 AS build
WORKDIR /app

# Copy csproj and restore as distinct layers
COPY dotnet-core.csproj .
RUN dotnet restore

# Copy everything else and build
COPY . .
RUN dotnet publish -c Release -o out

# Run stage
FROM mcr.microsoft.com/dotnet/aspnet:3.1 AS runtime
WORKDIR /app
COPY --from=build /app/out ./

# Set environment variables if needed
ENV ASPNETCORE_ENVIRONMENT=Production

# Expose the port and start the app
EXPOSE 5000
ENTRYPOINT ["dotnet", "./obj/Debug/dotnet-core.dll"]
