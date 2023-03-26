FROM mcr.microsoft.com/dotnet/aspnet:3.1 as base
WORKDIR /app

FROM mcr.microsoft.com/dotnet/sdk:3.1 AS build
COPY . /src
WORKDIR /src
RUN ls
RUN dotnet build "dotnet-core.csproj" -c Release -o /app/build

FROM build AS publish
RUN dotnet publish "dotnet-core.csproj" -c Release -o /app/publish

FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "dotnet-core.dll"]